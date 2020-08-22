SUMMARY = "NPM: vfile-location"
DESCRIPTION = "vfile utility to convert between positional (line and column-based) and offset (range-based) locations"
HOMEPAGE = "https://github.com/vfile/vfile-location#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vfile-location/-/vfile-location-3.1.0.tgz"
SRC_URI[md5sum] = "ca1277b23c6810a4636a6a0f1115afdc"
SRC_URI[sha256sum] = "d1f3671ae132c09c4d8803a972d1354fd7508e7a529afeb817f4df6d6a5b6176"

NPM_PKGNAME = "vfile-location"

inherit npmhelper
inherit native
