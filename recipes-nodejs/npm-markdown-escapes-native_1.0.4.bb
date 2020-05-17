SUMMARY = "NPM: markdown-escapes"
DESCRIPTION = "List of escapable characters in markdown"
HOMEPAGE = "https://github.com/wooorm/markdown-escapes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/markdown-escapes/-/markdown-escapes-1.0.4.tgz"
SRC_URI[md5sum] = "fb490f2c6d12604ab63efd4568edd3ad"
SRC_URI[sha256sum] = "3a91bbda208095bafc270830eba095f3e53429a8f4f9b85022ed134d9f43a087"

NPM_PKGNAME = "markdown-escapes"

inherit npmhelper
inherit native
