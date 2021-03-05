SUMMARY = "NPM: has-symbols"
DESCRIPTION = "Determine if the JS environment has Symbol support. Supports spec, or shams."
HOMEPAGE = "https://github.com/inspect-js/has-symbols#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=afee57a289508ed4df3456667778aaf6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-symbols/-/has-symbols-1.0.2.tgz"
SRC_URI[md5sum] = "6fa03a33b382263eedbbdc38c48cd24b"
SRC_URI[sha256sum] = "005c4ea47993c807c8a535827b56db30dde39400e918c424fc3de1cc3eb165dd"

NPM_PKGNAME = "has-symbols"

inherit npmhelper
inherit native
