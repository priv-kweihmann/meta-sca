SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash-native \
           npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.0.3.tgz"
SRC_URI[md5sum] = "b6769bc4485b27a83d3a10e056e1fb56"
SRC_URI[sha256sum] = "1503c285039f0e29811ff8aa0499f5e6c381c572043184df28ce92175f987864"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
