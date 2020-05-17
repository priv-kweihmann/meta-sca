SUMMARY = "NPM: nice-try"
DESCRIPTION = "Tries to execute a function and discards any error that occurs"
HOMEPAGE = "https://github.com/electerious/nice-try"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae2c9097ed1d346901fdc318eff30d78"

SRC_URI = "https://registry.npmjs.org/nice-try/-/nice-try-1.0.5.tgz"
SRC_URI[md5sum] = "9bdc972734877096936d7bb79b8e21ed"
SRC_URI[sha256sum] = "b450f299394fc95b24b79fe86019945a17b343dba93a33d9817ca47a17d103aa"

NPM_PKGNAME = "nice-try"

inherit npmhelper
inherit native
