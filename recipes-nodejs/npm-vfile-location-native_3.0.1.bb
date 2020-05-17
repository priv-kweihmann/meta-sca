SUMMARY = "NPM: vfile-location"
DESCRIPTION = "vfile utility to convert between positional (line and column-based) and offset (range-based) locations"
HOMEPAGE = "https://github.com/vfile/vfile-location#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/vfile-location/-/vfile-location-3.0.1.tgz"
SRC_URI[md5sum] = "6cc195b420996fbdbfc383c477c478b0"
SRC_URI[sha256sum] = "e9a5d3ccbb9a7d25ce1537e2c0ab91e0bae6663e91094bd6c696e380e5c5e2ac"

NPM_PKGNAME = "vfile-location"

inherit npmhelper
inherit native
