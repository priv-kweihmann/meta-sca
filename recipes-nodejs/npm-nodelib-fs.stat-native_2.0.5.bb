SUMMARY = "NPM: @nodelib/fs.stat"
DESCRIPTION = "Get the status of a file with some features"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.stat/-/fs.stat-2.0.5.tgz"
SRC_URI[md5sum] = "6b6637b1a5d58b964c8a8d99ccf544e6"
SRC_URI[sha256sum] = "d8f8533551f21aca87b3fc2d4bc2e2cc7ab221104902c07da3df20baaf52136b"

NPM_PKGNAME = "@nodelib/fs.stat"

inherit npmhelper
inherit native
