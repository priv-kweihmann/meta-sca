SUMMARY = "NPM: unherit"
DESCRIPTION = "Clone a constructor without affecting the super-class"
HOMEPAGE = "https://github.com/wooorm/unherit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-inherits-native"

SRC_URI = "https://registry.npmjs.org/unherit/-/unherit-2.0.0.tgz"
SRC_URI[md5sum] = "9d935327791c2738cda8b76160d18cb0"
SRC_URI[sha256sum] = "e2859698a8be4e319ee7d4ed692d58e0903b3badb652fcd275e8615e0dc03a04"

NPM_PKGNAME = "unherit"

inherit npmhelper
inherit native
