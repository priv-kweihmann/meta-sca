SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.4.0.tgz"
SRC_URI[md5sum] = "43a88251f524e3889159b2028f263442"
SRC_URI[sha256sum] = "34a685fcd9cd450bec972c68bffd3479e71b3ccad06c9755a644c78c98bae220"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
