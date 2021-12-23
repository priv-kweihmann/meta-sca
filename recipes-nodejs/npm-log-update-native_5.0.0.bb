SUMMARY = "NPM: log-update"
DESCRIPTION = "Log by overwriting the previous output in the terminal. Useful for rendering progress bars, animations, etc."
HOMEPAGE = "https://github.com/sindresorhus/log-update#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-escapes-native \
           npm-cli-cursor-native \
           npm-slice-ansi-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/log-update/-/log-update-5.0.0.tgz"
SRC_URI[md5sum] = "1f255f56955e1bc89863f7ddc4f0e437"
SRC_URI[sha256sum] = "45a41ed9a172bc1f6479488589a28abf85a76a945e8d56e26914953c4e0fee8f"

NPM_PKGNAME = "log-update"

inherit npmhelper
inherit native
