SUMMARY = "SCA tools packaged for nativesdk"

inherit sca-global packagegroup nativesdk

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} += "\
    ${@oe.utils.ifelse('bandit' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-bandit nativesdk-sca-recipe-bandit-rules', '')} \
    ${@oe.utils.ifelse('bashate' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-bashate nativesdk-sca-recipe-bashate-rules', '')} \
    ${@oe.utils.ifelse('checkbashism' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-checkbashism nativesdk-sca-recipe-checkbashism-rules', '')} \
    ${@oe.utils.ifelse('cppcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cppcheck nativesdk-sca-recipe-cppcheck-rules', '')} \
    ${@oe.utils.ifelse('cpplint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cpplint nativesdk-sca-recipe-cpplint-rules', '')} \
    ${@oe.utils.ifelse('darglint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-darglint nativesdk-sca-recipe-darglint-rules', '')} \
    ${@oe.utils.ifelse('dennis' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-dennis nativesdk-sca-recipe-dennis-rules', '')} \
    ${@oe.utils.ifelse('detectsecrets' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-detect-secrets nativesdk-sca-recipe-detectsecrets-rules', '')} \
    ${@oe.utils.ifelse('flake8' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-flake8-sca nativesdk-sca-recipe-flake8-rules', '')} \
    ${@oe.utils.ifelse('flawfinder' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-flawfinder nativesdk-sca-recipe-flawfinder-rules', '')} \
    ${@oe.utils.ifelse('flint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-flint++ nativesdk-sca-recipe-flint-rules', '')} \
    ${@oe.utils.ifelse('golint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-golint-sca nativesdk-sca-recipe-golint-rules', '')} \
    ${@oe.utils.ifelse('it' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-it nativesdk-sca-recipe-it-rules', '')} \
    ${@oe.utils.ifelse('jsonlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-jsonlint-sca nativesdk-sca-recipe-jsonlint-rules', '')} \
    ${@oe.utils.ifelse('kconfighard' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-kconfig-hardened-check nativesdk-sca-recipe-kconfighard-rules', '')} \
    ${@oe.utils.ifelse('looong' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-looong nativesdk-sca-recipe-looong-rules', '')} \
    ${@oe.utils.ifelse('msgcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-msgcheck nativesdk-sca-recipe-msgcheck-rules', '')} \
    ${@oe.utils.ifelse('multimetric' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-multimetric nativesdk-sca-recipe-multimetric-rules', '')} \
    ${@oe.utils.ifelse('mypy' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-mypy nativesdk-sca-recipe-mypy-rules', '')} \
    ${@oe.utils.ifelse('perl' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-perl-sca nativesdk-sca-recipe-perl-rules', '')} \
    ${@oe.utils.ifelse('perlcritic' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-perl-critic nativesdk-sca-recipe-perlcritic-rules', '')} \
    ${@oe.utils.ifelse('pscan' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-pscan nativesdk-sca-recipe-pscan-rules', '')} \
    ${@oe.utils.ifelse('pylint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-pylint nativesdk-sca-recipe-pylint-rules', '')} \
    ${@oe.utils.ifelse('pysymbolcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-pysymbolcheck nativesdk-sca-recipe-pysymcheck-rules', '')} \
    ${@oe.utils.ifelse('rats' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-rats nativesdk-sca-recipe-rats-rules', '')} \
    ${@oe.utils.ifelse('revive' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-revive-sca nativesdk-sca-recipe-revive-rules', '')} \
    ${@oe.utils.ifelse('setuptoolslint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-setuptools-lint nativesdk-python3-setuptools nativesdk-sca-recipe-setuptoolslint-rules', '')} \
    ${@oe.utils.ifelse('shellcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-shellcheck nativesdk-sca-recipe-shellcheck-rules', '')} \
    ${@oe.utils.ifelse('slick' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-slick-sca nativesdk-sca-recipe-slick-rules', '')} \
    ${@oe.utils.ifelse('sparse' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-sparse nativesdk-sca-recipe-sparse-rules', '')} \
    ${@oe.utils.ifelse('stank' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-stank-sca nativesdk-sca-recipe-stank-rules', '')} \
    ${@oe.utils.ifelse('systemdlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-systemdlint nativesdk-sca-recipe-systemdlint-rules', '')} \
    ${@oe.utils.ifelse('tlv' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-tlv', '')} \
    ${@oe.utils.ifelse('tscancode' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-tscancode nativesdk-sca-recipe-tscancode-rules', '')} \
    ${@oe.utils.ifelse('vulture' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-vulture nativesdk-sca-recipe-vulture-rules', '')} \
    ${@oe.utils.ifelse('xmllint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-xmllint-sca nativesdk-sca-recipe-xmllint-rules', '')} \
    ${@oe.utils.ifelse('yamllint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-yamllint nativesdk-sca-recipe-yamllint-rules', '')} \
    nativesdk-sca-runall \
"
