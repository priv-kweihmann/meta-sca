SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.5.2.tgz"
SRC_URI[md5sum] = "a06e00ed6453dabb44861d75f44b877f"
SRC_URI[sha256sum] = "653bc5f42bdd262d9f45232a817b6ff0c025dc6f7a3328dad3b0589a6e0d8128"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
