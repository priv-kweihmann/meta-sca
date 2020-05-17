SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://github.com/ReactiveX/RxJS"

DEPENDS = "npm-tslib-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-6.5.5.tgz"
SRC_URI[md5sum] = "993412dfccf059a031ff615621384077"
SRC_URI[sha256sum] = "d136dfc5700dc6d9cdb70c0fee0a4f0e2c9fe4dc2c0d76a12d84d90407e29f78"

S = "${WORKDIR}/package"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
