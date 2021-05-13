SUMMARY = "NPM: terminal-link"
DESCRIPTION = "Create clickable links in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/terminal-link#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-escapes-native \
           npm-supports-hyperlinks-native"

SRC_URI = "https://registry.npmjs.org/terminal-link/-/terminal-link-2.1.1.tgz"
SRC_URI[md5sum] = "f131d1e7d205ed1643f93354a96e6eb1"
SRC_URI[sha256sum] = "7b4ce824773fe7a6d9304aed5f9a9c882f0b0a73c480ecda76917312a0c1af09"

NPM_PKGNAME = "terminal-link"

inherit npmhelper
inherit native
