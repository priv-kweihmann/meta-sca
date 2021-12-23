SUMMARY = "NPM: formdata-polyfill"
DESCRIPTION = "HTML5 `FormData` for Browsers and Node."
HOMEPAGE = "https://github.com/jimmywarting/FormData#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfdf37436d551c3737dae60778380106"

DEPENDS = "npm-fetch-blob-native"

SRC_URI = "https://registry.npmjs.org/formdata-polyfill/-/formdata-polyfill-4.0.10.tgz"
SRC_URI[md5sum] = "dd83b29f9f00c62ac1a5af83d94aa92d"
SRC_URI[sha256sum] = "1ff73b4138ea33f0fd0f41b67910409a2c8eb1b71a4cf1a4f8ab738a6e8487e9"

NPM_PKGNAME = "formdata-polyfill"

inherit npmhelper
inherit native
