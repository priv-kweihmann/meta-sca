SUMMARY = "NPM: collapse-white-space"
DESCRIPTION = "Replace multiple white-space characters with a single space"
HOMEPAGE = "https://github.com/wooorm/collapse-white-space#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/collapse-white-space/-/collapse-white-space-1.0.6.tgz"
SRC_URI[md5sum] = "c8b0bd35fd6ec9e890c353400ec368eb"
SRC_URI[sha256sum] = "b8437ea5b6c9d29eb2d91c647f0ed6f1cbfe9a6378e8aa77e4d784ecc91b58b9"

NPM_PKGNAME = "collapse-white-space"

inherit npmhelper
inherit native
