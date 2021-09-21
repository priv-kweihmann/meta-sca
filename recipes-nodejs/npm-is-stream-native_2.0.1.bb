SUMMARY = "NPM: is-stream"
DESCRIPTION = "Check if something is a Node.js stream"
HOMEPAGE = "https://github.com/sindresorhus/is-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-stream/-/is-stream-2.0.1.tgz"
SRC_URI[md5sum] = "c3a1ab9ba58463f1dead35dc9d5aba9a"
SRC_URI[sha256sum] = "3501ff72a20b78f1a2170a4982d82d9a71d16b99a935bec9787f1c486d61b6d7"

NPM_PKGNAME = "is-stream"

inherit npmhelper
inherit native
