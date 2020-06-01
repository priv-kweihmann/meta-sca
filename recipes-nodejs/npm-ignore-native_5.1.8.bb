SUMMARY = "NPM: ignore"
DESCRIPTION = "Ignore is a manager and filter for .gitignore rules, the one used by eslint, gitbook and many others."
HOMEPAGE = "https://github.com/kaelzhang/node-ignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=df4fe86855c0c73f4a52d5e556826c48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ignore/-/ignore-5.1.8.tgz"
SRC_URI[md5sum] = "e383857e3056df8d2bafccace0aa0dc9"
SRC_URI[sha256sum] = "2f8ece8e090874d6bfc7c5f6c410aa09284db78c7d490b7671d01fade35d7ddc"

NPM_PKGNAME = "ignore"

inherit npmhelper
inherit native
