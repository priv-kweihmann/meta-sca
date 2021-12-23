SUMMARY = "NPM: supports-hyperlinks"
DESCRIPTION = "Detect if your terminal emulator supports hyperlinks"
HOMEPAGE = "https://github.com/jamestalmage/supports-hyperlinks#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8195d8f796dcc7c47fb602e26a78d6cb"

DEPENDS = "npm-has-flag-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/supports-hyperlinks/-/supports-hyperlinks-2.2.0.tgz"
SRC_URI[md5sum] = "96823e81925b83eefd51c34a73861d0a"
SRC_URI[sha256sum] = "4287c633c1f3740572926c1c0bf8c26c736caf968dcf09429aa928fbdb64f73f"

NPM_PKGNAME = "supports-hyperlinks"

inherit npmhelper
inherit native
