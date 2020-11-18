SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-16.0.2.tgz"
SRC_URI[md5sum] = "a951f4a8f260172efb0501c9f43cbdb3"
SRC_URI[sha256sum] = "21eb5f2bca26cca8f0d31afefdbffa281bf164e75315603bf389335fa5dd74df"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
