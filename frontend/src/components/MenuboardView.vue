<template>

    <v-data-table
        :headers="headers"
        :items="menuboard"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MenuboardView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            menuboard : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/menuboards'))

            temp.data._embedded.menuboards.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.menuboard = temp.data._embedded.menuboards;
        },
        methods: {
        }
    }
</script>

