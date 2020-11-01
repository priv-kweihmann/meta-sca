SUMMARY = "NPM: vfile-location"
DESCRIPTION = "vfile utility to convert between positional (line and column-based) and offset (range-based) locations"
HOMEPAGE = "https://github.com/vfile/vfile-location#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vfile-location/-/vfile-location-3.2.0.tgz"
SRC_URI[md5sum] = "599db08f182ec5c38fd5e0659cda5e4b"
SRC_URI[sha256sum] = "2bd7d0ad21653034cb2c92b913ddda6dcc3dd6b08ac12822ee316471aa02982b"

NPM_PKGNAME = "vfile-location"

inherit npmhelper
inherit native
