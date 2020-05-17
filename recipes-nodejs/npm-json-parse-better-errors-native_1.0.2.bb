SUMMARY = "NPM: json-parse-better-errors"
DESCRIPTION = "JSON.parse with context information on error"
HOMEPAGE = "https://github.com/zkat/json-parse-better-errors#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=048cc2006d506256349ca6088641486b"

SRC_URI = "https://registry.npmjs.org/json-parse-better-errors/-/json-parse-better-errors-1.0.2.tgz"
SRC_URI[md5sum] = "e1f1acd10f76a4311583814b8b797f32"
SRC_URI[sha256sum] = "02bc65d62528ebaa4c4c4ba962e27a8dbf334896ecd2688e550abe59ab5009c9"

NPM_PKGNAME = "json-parse-better-errors"

inherit npmhelper
inherit native
