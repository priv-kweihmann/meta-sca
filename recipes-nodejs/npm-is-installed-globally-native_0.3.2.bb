SUMMARY = "NPM: is-installed-globally"
DESCRIPTION = "Check if your package was installed globally"
HOMEPAGE = "https://github.com/sindresorhus/is-installed-globally#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-global-dirs-native \
           npm-is-path-inside-native"

SRC_URI = "https://registry.npmjs.org/is-installed-globally/-/is-installed-globally-0.3.2.tgz"
SRC_URI[md5sum] = "cc8509db89d98b00d981e4a7cb1bdf1f"
SRC_URI[sha256sum] = "fea98ca5a5618fce7207e90482124b8847a0a5c8398e5a7567bef483b7662469"

NPM_PKGNAME = "is-installed-globally"

inherit npmhelper
inherit native
