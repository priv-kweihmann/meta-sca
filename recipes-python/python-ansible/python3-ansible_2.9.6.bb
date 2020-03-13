DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy."
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

SRCNAME = "ansible"

SRC_URI = "http://releases.ansible.com/ansible/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "a871463bcd809363a5857f4690525a93"
SRC_URI[sha256sum] = "59cf3a0781f89992d1dae5205b07e802dff1db205eebd238de9e503b62b8cbc9"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools3

DEPENDS += "${PYTHON_PN}-pyyaml ${PYTHON_PN}-jinja2"
RDEPENDS_${PN} += "${PYTHON_PN}-pyyaml ${PYTHON_PN}-jinja2 ${PYTHON_PN}-modules"

do_install_append() {
    set +e

    # install hosts and conf
    install -d ${D}/${sysconfdir}/ansible

    # There is no default inventory configuration installed for ansible,
    # so we use the example as a template to improve OOBE.
    install ${S}/examples/hosts ${D}/${sysconfdir}/ansible/
    install ${S}/examples/ansible.cfg ${D}/${sysconfdir}/ansible/

    # do not gather machine's information, which could reduce setup time
    sed -i "s|^#gathering = implicit|gathering = explicit|g" \
        ${D}/${sysconfdir}/ansible/ansible.cfg
}

CLEANBROKEN = "1"

BBCLASSEXTEND = "native"
