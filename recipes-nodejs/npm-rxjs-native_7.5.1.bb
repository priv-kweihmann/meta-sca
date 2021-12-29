SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.5.1.tgz"
SRC_URI[md5sum] = "a6f7fa8784bf150a61b8d6358f03a152"
SRC_URI[sha256sum] = "669d9e4938d10f58264191d2464c19eef5217d6c462698a7b240b34613614c5e"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
