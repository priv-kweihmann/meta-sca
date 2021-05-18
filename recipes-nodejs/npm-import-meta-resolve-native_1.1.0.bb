SUMMARY = "NPM: import-meta-resolve"
DESCRIPTION = "Resolve things like Node.js — ponyfill for `import.meta.resolve`"
HOMEPAGE = "https://github.com/wooorm/import-meta-resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=5dc2bb8d675a94d28780e8e16a5bfa12"

DEPENDS = "npm-builtins-native"

SRC_URI = "https://registry.npmjs.org/import-meta-resolve/-/import-meta-resolve-1.1.0.tgz"
SRC_URI[md5sum] = "726d8a386f437d049eb2bbb205804b22"
SRC_URI[sha256sum] = "97d4a2c1e3e397eab104e0d276389e7e55016d65bc860d7ead103939a390a3bc"

NPM_PKGNAME = "import-meta-resolve"

inherit npmhelper
inherit native
