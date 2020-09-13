SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://github.com/ReactiveX/RxJS"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-6.6.3.tgz"
SRC_URI[md5sum] = "7bc0986ff7fe93107d8d469af1126428"
SRC_URI[sha256sum] = "84b9cee2e7893cf204f913814b39e4e5a5e3f018a0997b7cadcfcbbebd5d70da"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
