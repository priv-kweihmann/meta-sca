SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.5.4.tgz"
SRC_URI[md5sum] = "be50e641aa40a0f70cd48662a3a74fef"
SRC_URI[sha256sum] = "a6b3a844e192888d0372c230648f726be532bf272032dfdd291c3d06c7457405"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
