SUMMARY = "NPM: is-arguments"
DESCRIPTION = "Is this an arguments object? It's a harder question than you think."
HOMEPAGE = "https://github.com/ljharb/is-arguments"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

SRC_URI = "https://registry.npmjs.org/is-arguments/-/is-arguments-1.0.4.tgz"
SRC_URI[md5sum] = "720f7670c3534b53497a91a7929dfd7b"
SRC_URI[sha256sum] = "8afe33ec76149bd5dd1bab1cd3f251016defc16991b0703e8e711391bae4df2a"

NPM_PKGNAME = "is-arguments"

inherit npmhelper
inherit native
