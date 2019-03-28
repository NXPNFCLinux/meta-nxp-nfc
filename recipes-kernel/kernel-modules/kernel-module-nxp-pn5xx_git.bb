# Copyright (C) 2016 NXP Semiconductor
SUMMARY = "NXP NFC Kernel Module"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

inherit module

SRC_URI = " \
    git://github.com/NXPNFCLinux/nxp-pn5xx.git;branch=master \
    file://0001-Add-.gitignore.patch \
    file://0002-Makefile-cleanup-tagetting-a-Yocto-Project-recipe.patch \
"
SRCREV = "573e2ddb7cd15c34d3da0743318569f48b949ceb"

S = "${WORKDIR}/git"
