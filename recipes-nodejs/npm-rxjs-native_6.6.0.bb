SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://github.com/ReactiveX/RxJS"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-6.6.0.tgz"
SRC_URI[md5sum] = "f9793cc44cf94269aea7e041ab9312f6"
SRC_URI[sha256sum] = "451813f7b5dca6f76275c962c002c922fd3b4c54d66fa1edb04ea4c0dd217975"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
