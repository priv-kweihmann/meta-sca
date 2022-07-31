## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_CONFIGCHECK_EXTRA_SUPPRESS ?= ""
SCA_CONFIGCHECK_EXTRA_FATAL ?= ""
SCA_CONFIGCHECK_MODULES ?= "\
                            apache2 \
                            cups \
                            freeradius \
                            lighttpd \
                            nftables \
                            nginx \
                            ntp \
                            postfix \
                            proftpd \
                            samba \
                            squid \
                            sshd \
                            vsftpd \
                           "

SCA_RAW_RESULT_FILE[configcheck] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress
inherit sca-image-backtrack

inherit sca-configcheck-mod-apache2
inherit sca-configcheck-mod-cups
inherit sca-configcheck-mod-freeradius
inherit sca-configcheck-mod-lighttpd
inherit sca-configcheck-mod-nftables
inherit sca-configcheck-mod-nginx
inherit sca-configcheck-mod-ntp
inherit sca-configcheck-mod-postfix
inherit sca-configcheck-mod-proftpd
inherit sca-configcheck-mod-samba
inherit sca-configcheck-mod-squid
inherit sca-configcheck-mod-sshd
inherit sca-configcheck-mod-vsftpd

def do_sca_conv_configcheck(d, findings):
    sca_add_model_class_list(d, findings)
    return sca_save_model_to_string(d)

sca_configcheck_prepare() {
    ## openssl requires /dev/null for key generation
    mkdir -p ${IMAGE_ROOTFS}/dev || true
    mknod ${IMAGE_ROOTFS}/dev/null c 1 3 || true
    chmod 666 ${IMAGE_ROOTFS}/dev/null || true

    ## nginx requires its log dir
    mkdir -p ${IMAGE_ROOTFS}/var/log/nginx/ || true

    ## apache requires its log dir
    mkdir -p ${IMAGE_ROOTFS}/var/log/apache2/ || true

    ## create at least the configured include dir of nftables
    mkdir -p ${IMAGE_ROOTFS}${SCA_CONFIGCHECK_nftables_INCLUDEDIR} || true
}

fakeroot python do_sca_configcheck() {
    import os
    import subprocess

    cmd_output = ""

    _raw_findings = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_CONFIGCHECK_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/configcheck-${SCA_MODE}-suppress"))

    _pargs = []
    _conv_funcs = []

    for mod in clean_split(d, "SCA_CONFIGCHECK_MODULES"):
        _run_args_name = "do_sca_configcheck_run_{}".format(mod)
        _conv_funcs.append("do_sca_configcheck_conv_{}".format(mod))

        try:
            _pargs += [" ".join(sca_get_func_by_name(d, _run_args_name)(d))]
        except:
            pass

    _cmd_output = ""

    if any(_pargs):
        _cmd_output, _ = sca_crossemu(d, ["/bin/sh", "-c", ";echo 'EOM###########';".join(_pargs)], ["bash"], "configcheck", 
                                        "sca_configcheck_prepare;")

        if not isinstance(_cmd_output, str):
            _cmd_output = _cmd_output.decode("utf-8")
        
        with open(sca_raw_result_file(d, "configcheck"), "w") as o:
            o.write(_cmd_output)

        if _cmd_output:
            _cmd_output = _cmd_output.split("###########\n")
            for _conv in _conv_funcs:
                try:
                    _raw_findings += sca_get_func_by_name(d, _conv)(d, _cmd_output.pop(), _suppress)
                    del _cmd_output[0]
                except IndexError:
                    pass
                except NotImplementedError:
                    pass
    else:
        with open(sca_raw_result_file(d, "configcheck"), "w") as o:
            o.write(_cmd_output)
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/configcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_configcheck(d, _raw_findings)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "configcheck", get_fatal_entries(d, clean_split(d, "SCA_TIGER_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/configcheck-${SCA_MODE}-fatal")))
}

do_sca_configcheck[doc] = "Check configuration of tools for validity in image"
do_sca_configcheck[nosdkgen] = "1"
addtask do_sca_configcheck before do_sca_deploy after do_image

DEPENDS += "configcheck-sca-native sca-image-configcheck-rules-native"
