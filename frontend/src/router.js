
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import StoreOrderManager from "./components/listers/StoreOrderCards"
import StoreOrderDetail from "./components/listers/StoreOrderDetail"
import PreferenceManager from "./components/listers/PreferenceCards"
import PreferenceDetail from "./components/listers/PreferenceDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import NoticeManager from "./components/listers/NoticeCards"
import NoticeDetail from "./components/listers/NoticeDetail"

import FoodListManager from "./components/listers/FoodListCards"
import FoodListDetail from "./components/listers/FoodListDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import MenuboardView from "./components/MenuboardView"
import MenuboardViewDetail from "./components/MenuboardViewDetail"
import FoodListManager from "./components/listers/FoodListCards"
import FoodListDetail from "./components/listers/FoodListDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/storeOrders',
                name: 'StoreOrderManager',
                component: StoreOrderManager
            },
            {
                path: '/storeOrders/:id',
                name: 'StoreOrderDetail',
                component: StoreOrderDetail
            },
            {
                path: '/preferences',
                name: 'PreferenceManager',
                component: PreferenceManager
            },
            {
                path: '/preferences/:id',
                name: 'PreferenceDetail',
                component: PreferenceDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/notices',
                name: 'NoticeManager',
                component: NoticeManager
            },
            {
                path: '/notices/:id',
                name: 'NoticeDetail',
                component: NoticeDetail
            },

            {
                path: '/foodLists',
                name: 'FoodListManager',
                component: FoodListManager
            },
            {
                path: '/foodLists/:id',
                name: 'FoodListDetail',
                component: FoodListDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/menuboards',
                name: 'MenuboardView',
                component: MenuboardView
            },
            {
                path: '/menuboards/:id',
                name: 'MenuboardViewDetail',
                component: MenuboardViewDetail
            },
            {
                path: '/foodLists',
                name: 'FoodListManager',
                component: FoodListManager
            },
            {
                path: '/foodLists/:id',
                name: 'FoodListDetail',
                component: FoodListDetail
            },



    ]
})
