# Copyright (C) 2016 NXP Semiconductors

DESCRIPTION = "Linux NFC stack for NCI based NXP NFC Controllers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/include/linux_nfc_api.h;md5=0a45e480f6d1b3df6ca6994772ddfe28"

SRC_URI = " \
    git://github.com/NXPNFCLinux/linux_libnfc-nci.git;branch=NCI2.0_PN7160 \
"
SRCREV = "6bf9f42b94e267f6384043009bda84c11e7ebbaa"

inherit autotools pkgconfig lib_package

S = "${WORKDIR}/git"

# RDEPENDS on nxp-pn5xx kernel module
RDEPENDS_${PN} = "kernel-module-nxp-pn5xx"

