SUMMARY = "NPM: terminal-link"
DESCRIPTION = "Create clickable links in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/terminal-link#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-escapes-native \
           npm-supports-hyperlinks-native"

SRC_URI = "https://registry.npmjs.org/terminal-link/-/terminal-link-3.0.0.tgz"
SRC_URI[md5sum] = "e5b548a93767f05ee7ce56d0a57c6d30"
SRC_URI[sha256sum] = "b924a012933c5eac5d411d65d02aabe1c01e2e3d21bcb6ab6353311e2f6f4e3e"

NPM_PKGNAME = "terminal-link"

inherit npmhelper
inherit native
