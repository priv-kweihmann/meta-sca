SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash-native \
           npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.0.7.tgz"
SRC_URI[md5sum] = "09f97fa815e840a1552e2dc947c8e3b9"
SRC_URI[sha256sum] = "8e54081bdf9008cb0391841f8beb56272afb36655bc7ae2fbe39f0119fc39f52"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
