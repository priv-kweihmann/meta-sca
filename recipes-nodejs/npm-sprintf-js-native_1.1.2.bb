SUMMARY = "NPM: sprintf-js"
DESCRIPTION = "JavaScript sprintf implementation"
HOMEPAGE = "https://github.com/alexei/sprintf.js#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1de2a9f1100beb2ed52da1db9ca232c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/sprintf-js/-/sprintf-js-1.1.2.tgz"
SRC_URI[md5sum] = "b99f9f9f5645d8f0b591bb194b49be22"
SRC_URI[sha256sum] = "d42832043743fce1b60c9fbd1158df3a56af00a11e3fd6c72b2382666b02dc24"

NPM_PKGNAME = "sprintf-js"

inherit npmhelper
inherit native
