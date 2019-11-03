SUMMARY = "The pluggable natural language linter for text and markdown."
DESCRIPTION = "The pluggable natural language linter for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint"

## Somethings wrong with the tags currently used by this project
## So for now switch to plain revision again

SRC_URI = "git://github.com/textlint/textlint.git;protocol=https \
           file://textlint.sca.description \
           file://textlint.sca.score"
SRCREV = "5ceabb1c4c1cd02d3389e9bb61c2a5af8e5d1a37"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://git/LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS += "nodejs-native"

inherit native

S = "${WORKDIR}"

do_compile() {
    :
}

do_install() {
    export HOME=${WORKDIR}
    cd ${WORKDIR}
	mkdir -p ${D}${libdir}/node_modules
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-todo@2.0.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-start-duplicated-conjunction@2.0.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-max-number-of-lines@1.0.3
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-max-comma@1.0.4
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-exclamation-question-mark@1.0.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-ng-word@1.0.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-dead-link@4.6.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-empty-section@1.1.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-unexpanded-acronym@1.2.3
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-alex@1.3.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-write-good@1.6.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-rousseau@1.4.6
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-en-max-word-count@1.0.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-filter-rule-comments@1.2.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-plugin-html@0.2.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-plugin-rst@0.1.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-date-weekday-mismatch@1.0.5
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-terminology@2.0.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-period-in-list-item@0.3.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-nfd@1.0.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production @textlint-rule/textlint-rule-no-invalid-control-character@1.2.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-no-surrogate-pair@1.0.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-abbr-within-parentheses@1.0.2
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-common-misspellings@1.0.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-ginger@2.2.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-apostrophe@1.0.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-diacritics@1.0.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-stop-words@1.0.17
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production textlint-rule-en-capitalization@2.0.2
	if [ -d ${D}${prefix}/etc ] ; then
		# This will be empty
		rmdir ${D}${prefix}/etc
	fi

    mkdir -p ${D}${datadir}

    install ${WORKDIR}/textlint.sca.description ${D}${datadir}
    install ${WORKDIR}/textlint.sca.score ${D}${datadir}
}

FILES_${PN} += "${datadir}"
