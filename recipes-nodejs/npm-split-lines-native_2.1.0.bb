SUMMARY = "NPM: split-lines"
DESCRIPTION = "Split lines into an array of lines"
HOMEPAGE = "https://github.com/sindresorhus/split-lines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/split-lines/-/split-lines-2.1.0.tgz"
SRC_URI[md5sum] = "e83ea019e358bd153b70593b03f75243"
SRC_URI[sha256sum] = "b926d6faefda237bf5468213ec2162d8303b6015dfc48e4f5848973a881ad804"

NPM_PKGNAME = "split-lines"

inherit npmhelper
inherit native
