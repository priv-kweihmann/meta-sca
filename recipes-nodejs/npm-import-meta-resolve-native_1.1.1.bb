SUMMARY = "NPM: import-meta-resolve"
DESCRIPTION = "Resolve things like Node.js — ponyfill for `import.meta.resolve`"
HOMEPAGE = "https://github.com/wooorm/import-meta-resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=5dc2bb8d675a94d28780e8e16a5bfa12"

DEPENDS = "npm-builtins-native"

SRC_URI = "https://registry.npmjs.org/import-meta-resolve/-/import-meta-resolve-1.1.1.tgz"
SRC_URI[md5sum] = "2ecc175a198a6c540b3c6b7c021e3e35"
SRC_URI[sha256sum] = "366c423943971a00d467ab4f09b269f2be67466cf9268d5efd14c7fc2a526607"

NPM_PKGNAME = "import-meta-resolve"

inherit npmhelper
inherit native
