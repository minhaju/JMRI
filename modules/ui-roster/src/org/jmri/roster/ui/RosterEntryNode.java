package org.jmri.roster.ui;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import jmri.jmrit.roster.RosterEntry;
import org.openide.nodes.BeanNode;
import org.openide.util.Utilities;

/**
 *
 * @author Randall Wood <randall.h.wood@alexandriasoftware.com>
 */
public class RosterEntryNode extends BeanNode {

    public RosterEntryNode(RosterEntry bean) throws IntrospectionException {
        super(bean);
        this.setDisplayName(bean.getDisplayName());
    }

    @Override
    public Action[] getActions(boolean context) {
        List<Action> actions = new ArrayList<>(Utilities.actionsForPath("Actions/Roster/Entry"));
        return actions.toArray(new Action[actions.size()]);
    }
}