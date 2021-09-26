SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.3.0.tgz"
SRC_URI[md5sum] = "975fae971b61937c6477c7792740ded5"
SRC_URI[sha256sum] = "98573b62a091f35f9c0a888bea3c55d1acc65ff3e28e663e3a511d6569a3d0fb"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
