SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://github.com/ReactiveX/RxJS"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-6.6.2.tgz"
SRC_URI[md5sum] = "efc6927df1a3ab7046875b91fb8fb0c9"
SRC_URI[sha256sum] = "c20f96426c2d79cd0fc7ed7e5c884b6325e1fd5a1ce6d4956f8b0e5757bc91d3"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
