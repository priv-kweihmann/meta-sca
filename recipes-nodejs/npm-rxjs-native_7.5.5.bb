SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://rxjs.dev"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-7.5.5.tgz"
SRC_URI[md5sum] = "0adf32826ac5158b6a42e3cc35a0b80b"
SRC_URI[sha256sum] = "6ea0cb0acafd4e2603bc2cdef605bb4d8929dab7b532188e0eaf27707bd78f77"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
