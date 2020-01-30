#! /bin/sh
# This script checks all recipes from this layer for updates

devtool check-upgrade-status $(bitbake-layers show-recipes -l meta-sca -b | grep ":$" | tr -d ':' | tr '\n' ' ') 2>&1 | grep "INFO:"
