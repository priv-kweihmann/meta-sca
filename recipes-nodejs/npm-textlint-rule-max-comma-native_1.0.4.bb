SUMMARY = "NPM: textlint-rule-max-comma"
DESCRIPTION = "textlint rule that limit maxinum comma(,) count of sentence."
HOMEPAGE = "https://github.com/azu/textlint-rule-max-comma#readme"

DEPENDS = "npm-sentence-splitter-native npm-unist-util-filter-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-max-comma/-/textlint-rule-max-comma-1.0.4.tgz"
SRC_URI[md5sum] = "cd0d90782f998e340d9298cfb9fbdf05"
SRC_URI[sha256sum] = "966957b0f6848ab6482f22d59b7c0d085f62108e753127306984826ab83dbfea"

NPM_PKGNAME = "textlint-rule-max-comma"

inherit npmhelper
inherit native
