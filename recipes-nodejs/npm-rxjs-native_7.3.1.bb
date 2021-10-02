SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.3.1.tgz"
SRC_URI[md5sum] = "60641bf288fe6e0f1d04f901472da8bd"
SRC_URI[sha256sum] = "9f267cfeb4fe4dcc836d1f55b008676a4e6d18f44773c81b2ec2115cf93e231d"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
