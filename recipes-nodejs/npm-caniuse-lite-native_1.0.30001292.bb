SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001292.tgz"
SRC_URI[md5sum] = "0164ce3ca2a313ce2348e802761f5ad0"
SRC_URI[sha256sum] = "741a6e14e52cfc4c28041aef59d5f8196083e694707d80edd9753892e05c9347"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
