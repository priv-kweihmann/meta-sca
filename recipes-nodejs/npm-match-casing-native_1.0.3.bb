SUMMARY = "NPM: match-casing"
DESCRIPTION = "Match the case of `value` to that of `base`"
HOMEPAGE = "https://github.com/wooorm/match-casing#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/match-casing/-/match-casing-1.0.3.tgz"
SRC_URI[md5sum] = "e6a913fea502a734b2a792238e5fb71e"
SRC_URI[sha256sum] = "340cb78c98710d67ee4cd65ea732a55962e26bbcbced2be7240309d2193d3383"

NPM_PKGNAME = "match-casing"

inherit npmhelper
inherit native
