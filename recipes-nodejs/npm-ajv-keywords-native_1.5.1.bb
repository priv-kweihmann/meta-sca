SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-1.5.1.tgz"
SRC_URI[md5sum] = "32a05ade9df24d4ba6b0fb880c1ea578"
SRC_URI[sha256sum] = "8e9e6f40527df1d26da80977bdd2ed8bb3acd678fd0eeca83649398d5765d7a4"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
