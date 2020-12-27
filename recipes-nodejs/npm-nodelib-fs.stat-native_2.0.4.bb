SUMMARY = "NPM: @nodelib/fs.stat"
DESCRIPTION = "Get the status of a file with some features"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.stat/-/fs.stat-2.0.4.tgz"
SRC_URI[md5sum] = "dc9f6458529e82164b72c9db979e6fa9"
SRC_URI[sha256sum] = "8f9ac127930080ab3da2fd124eeefe9136d312b195bfc082600d623a73fc7527"

NPM_PKGNAME = "@nodelib/fs.stat"

inherit npmhelper
inherit native
