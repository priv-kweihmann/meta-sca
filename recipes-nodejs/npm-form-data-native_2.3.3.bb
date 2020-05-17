SUMMARY = "NPM: form-data"
DESCRIPTION = "A library to create readable "multipart/form-data" streams. Can be used to submit forms and file uploads to other web applications."
HOMEPAGE = "https://github.com/form-data/form-data#readme"

DEPENDS = "npm-asynckit-native npm-combined-stream-native npm-mime-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=7aa505292e2636a9e59d4d3f258f4819"

SRC_URI = "https://registry.npmjs.org/form-data/-/form-data-2.3.3.tgz"
SRC_URI[md5sum] = "08833fa830e83c7c4962e446a0b1a759"
SRC_URI[sha256sum] = "e39ecf83f4c79bb67004b7023d353e718db5a0c27bd4909957187b8d4e5033c8"

S = "${WORKDIR}/package"

NPM_PKGNAME = "form-data"

inherit npmhelper
inherit native
