SUMMARY = "NPM: trough"
DESCRIPTION = "Middleware: a channel used to convey a liquid"
HOMEPAGE = "https://github.com/wooorm/trough#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trough/-/trough-2.1.0.tgz"
SRC_URI[md5sum] = "992477352422225c6e44174a9e3a04ee"
SRC_URI[sha256sum] = "d80637868491b949574ae8f714594091b7be86284f7226ac15bc0704741dbf02"

NPM_PKGNAME = "trough"

inherit npmhelper
inherit native
