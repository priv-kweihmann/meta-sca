SUMMARY = "NPM: req-all"
DESCRIPTION = "Require all files in a directory"
HOMEPAGE = "https://github.com/sindresorhus/req-all#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/req-all/-/req-all-1.0.0.tgz"
SRC_URI[md5sum] = "6c869869df7f8710c151d46602ec012b"
SRC_URI[sha256sum] = "95e9219a0a34222f2e3c79fa114c4e23c7a0f139c8e77bb8300a2527d8f64295"

NPM_PKGNAME = "req-all"

inherit npmhelper
inherit native
