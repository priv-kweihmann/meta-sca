SUMMARY = "NPM: trough"
DESCRIPTION = "Middleware: a channel used to convey a liquid"
HOMEPAGE = "https://github.com/wooorm/trough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trough/-/trough-2.0.1.tgz"
SRC_URI[md5sum] = "30a9dca8ca38b5e805e17fa35810b033"
SRC_URI[sha256sum] = "8c18d0d550f346f24519fc20a7afb72ac60408f55bd36053e651e8c7af456a5f"

NPM_PKGNAME = "trough"

inherit npmhelper
inherit native
